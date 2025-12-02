package parser;

import view.Tela;

public class ArvoreSintatica {

    // método "principal" para desenhar a árvore
    public static void dump(SimpleNode root, String prefix, Tela window) {
        if (root == null) return;
        dumpNode(root, prefix, window);
    }

    // percorre recursivamente a árvore
    private static void dumpNode(SimpleNode node, String prefix, Tela window) {
        if (node == null) return;

        // escreve o nó atual na área de árvore da interface
        window.setMsg(prefix + node.toString() + "\n");
        // se o seu SimpleNode tiver toString(String), você pode usar:
        // window.setMsg(node.toString(prefix) + "\n");

        // percorre os filhos
        int n = node.jjtGetNumChildren();
        for (int i = 0; i < n; i++) {
            SimpleNode child = (SimpleNode) node.jjtGetChild(i);
            if (child != null) {
                dumpNode(child, prefix + " ", window);
            }
        }
    }
}
