package recovery;

import parser.*;

@SuppressWarnings({ "removal", "rawtypes", "unchecked" })
public class Follow { // implementa os conjuntos de sincronização (follow) p/ alguns n.terminais

    // Conjuntos de sincronização
    static public final RecoverySet main              = new RecoverySet();
    static public final RecoverySet id                = new RecoverySet();
    static public final RecoverySet declaracaoVariavel = new RecoverySet();
    static public final RecoverySet comando           = new RecoverySet();
    static public final RecoverySet bloco = new RecoverySet();
    static public final RecoverySet blocoIf = new RecoverySet();
    static public final RecoverySet blocoWhile = new RecoverySet();
    static public final RecoverySet expressao = new RecoverySet();
    static public final RecoverySet whileLoop     = new RecoverySet();
    static public final RecoverySet breakStmt     = new RecoverySet();
    static public final RecoverySet continueStmt  = new RecoverySet();
    static public final RecoverySet forLoop       = new RecoverySet();
    static public final RecoverySet blocoFor      = new RecoverySet();
    static public final RecoverySet forInitOpt    = new RecoverySet();
    static public final RecoverySet forCondOpt    = new RecoverySet();
    static public final RecoverySet forUpdateOpt  = new RecoverySet();
    static public final RecoverySet forInit       = new RecoverySet();
    static public final RecoverySet atribuicaoFor = new RecoverySet();
    static public final RecoverySet ifStmt      = new RecoverySet();
    static public final RecoverySet elseClause  = new RecoverySet();
    static public final RecoverySet blocoElse   = new RecoverySet();
    static public final RecoverySet atribuicao  = new RecoverySet();
    static public final RecoverySet printStmt   = new RecoverySet();
    static public final RecoverySet listaDeclaracoes = new RecoverySet();
    static public final RecoverySet declaracaoUnica  = new RecoverySet();
    static public final RecoverySet tipoDado         = new RecoverySet();
    static public final RecoverySet tipoCondicao     = new RecoverySet();
    static public final RecoverySet exprOr               = new RecoverySet();
    static public final RecoverySet exprOrLinha          = new RecoverySet();
    static public final RecoverySet exprAnd              = new RecoverySet();
    static public final RecoverySet exprAndLinha         = new RecoverySet();
    static public final RecoverySet exprRel              = new RecoverySet();
    static public final RecoverySet exprRelLinha         = new RecoverySet();
    static public final RecoverySet exprAditiva          = new RecoverySet();
    static public final RecoverySet exprAditivaLinha     = new RecoverySet();
    static public final RecoverySet exprMultiplicativa   = new RecoverySet();
    static public final RecoverySet exprMultiplicativaLinha = new RecoverySet();
    static public final RecoverySet exprUnaria              = new RecoverySet();
    static public final RecoverySet exprPrimaria            = new RecoverySet();

    static {
      
        main.add(new Integer(CompiladorAulaConstants.EOF));

      
        id.add(new Integer(CompiladorAulaConstants.ATRIBUICAO));
        id.add(new Integer(CompiladorAulaConstants.VIRGULA));
        id.add(new Integer(CompiladorAulaConstants.PONTOVIRGULA));

        declaracaoVariavel.add(CompiladorAulaConstants.TIPOINTEIRO);
        declaracaoVariavel.add(CompiladorAulaConstants.TIPOBINARIO);
        declaracaoVariavel.add(CompiladorAulaConstants.TIPOTEXTO);
        declaracaoVariavel.add(CompiladorAulaConstants.TIPOFLUTUANTE);

        declaracaoVariavel.add(CompiladorAulaConstants.ID);
        declaracaoVariavel.add(CompiladorAulaConstants.IF);
        declaracaoVariavel.add(CompiladorAulaConstants.WHILE);
        declaracaoVariavel.add(CompiladorAulaConstants.FOR);
        declaracaoVariavel.add(CompiladorAulaConstants.BREAK);
        declaracaoVariavel.add(CompiladorAulaConstants.PRINTF);
        declaracaoVariavel.add(CompiladorAulaConstants.CONTINUE);

        declaracaoVariavel.add(CompiladorAulaConstants.BEDROCK);
        declaracaoVariavel.add(CompiladorAulaConstants.FECHARWHILE);
        declaracaoVariavel.add(CompiladorAulaConstants.FECHARFOR);
        declaracaoVariavel.add(CompiladorAulaConstants.FECHARIF);
        declaracaoVariavel.add(CompiladorAulaConstants.FECHARELSE);

       
     comando.add(new Integer(CompiladorAulaConstants.BEDROCK));
        comando.add(new Integer(CompiladorAulaConstants.FECHARIF));
        comando.add(new Integer(CompiladorAulaConstants.FECHARELSE));
        comando.add(new Integer(CompiladorAulaConstants.FECHARWHILE));
        comando.add(new Integer(CompiladorAulaConstants.FECHARFOR));

      
        comando.add(new Integer(CompiladorAulaConstants.TIPOINTEIRO));
        comando.add(new Integer(CompiladorAulaConstants.TIPOFLUTUANTE));
        comando.add(new Integer(CompiladorAulaConstants.TIPOTEXTO));
        comando.add(new Integer(CompiladorAulaConstants.TIPOBINARIO));

      
        comando.add(new Integer(CompiladorAulaConstants.IF));
        comando.add(new Integer(CompiladorAulaConstants.WHILE));
        comando.add(new Integer(CompiladorAulaConstants.FOR));
        comando.add(new Integer(CompiladorAulaConstants.BREAK));
        comando.add(new Integer(CompiladorAulaConstants.PRINTF));
        comando.add(new Integer(CompiladorAulaConstants.CONTINUE));
        comando.add(new Integer(CompiladorAulaConstants.ID)); 
        
        
        bloco.add(CompiladorAulaConstants.EOF);
        blocoIf.add(CompiladorAulaConstants.FECHARIF);
        blocoWhile.add(CompiladorAulaConstants.FECHARWHILE);
        
        
    
        expressao.add(CompiladorAulaConstants.ABRIRWHILE);
        expressao.add(CompiladorAulaConstants.ABRIRIF);
        expressao.add(CompiladorAulaConstants.PONTOVIRGULA);
        expressao.add(CompiladorAulaConstants.VIRGULA);
        expressao.add(CompiladorAulaConstants.PARENTES_DIREITA);
        
        
        whileLoop.addAll(comando);

        breakStmt.addAll(comando);

        continueStmt.addAll(comando);
        
        forLoop.addAll(comando);

        blocoFor.add(CompiladorAulaConstants.FECHARFOR);

        forInitOpt.add(CompiladorAulaConstants.PONTOVIRGULA);

        forCondOpt.add(CompiladorAulaConstants.PONTOVIRGULA);

        forUpdateOpt.add(CompiladorAulaConstants.PARENTES_DIREITA);

        forInit.add(CompiladorAulaConstants.PONTOVIRGULA);

        atribuicaoFor.add(CompiladorAulaConstants.VIRGULA);
        atribuicaoFor.add(CompiladorAulaConstants.PONTOVIRGULA);
        atribuicaoFor.add(CompiladorAulaConstants.PARENTES_DIREITA);
        
     
        ifStmt.addAll(comando);

        elseClause.addAll(comando);
        blocoElse.add(CompiladorAulaConstants.FECHARELSE);
      
        atribuicao.addAll(comando);

        printStmt.addAll(comando);
       
        listaDeclaracoes.add(CompiladorAulaConstants.PONTOVIRGULA);

        declaracaoUnica.add(CompiladorAulaConstants.VIRGULA);
        declaracaoUnica.add(CompiladorAulaConstants.PONTOVIRGULA);

        tipoDado.add(CompiladorAulaConstants.ID);

        tipoCondicao.add(CompiladorAulaConstants.ID);
        tipoCondicao.add(CompiladorAulaConstants.DECIMAL);
        tipoCondicao.add(CompiladorAulaConstants.STRING);
        tipoCondicao.add(CompiladorAulaConstants.TRUE);
        tipoCondicao.add(CompiladorAulaConstants.FALSE);
        tipoCondicao.add(CompiladorAulaConstants.PARENTES_ESQUERDA);
        
      
        exprOr.addAll(expressao);

      
        exprOrLinha.addAll(exprOr);

        exprAnd.add(CompiladorAulaConstants.OR);
        exprAnd.addAll(exprOr);

        exprAndLinha.addAll(exprAnd);

        exprRel.add(CompiladorAulaConstants.AND);
        exprRel.addAll(exprAnd);

        exprRelLinha.addAll(exprRel);

        exprAditiva.add(CompiladorAulaConstants.MAIOR);
        exprAditiva.add(CompiladorAulaConstants.MENOR);
        exprAditiva.add(CompiladorAulaConstants.MAIOR_IGUAL);
        exprAditiva.add(CompiladorAulaConstants.MENOR_IGUAL);
        exprAditiva.add(CompiladorAulaConstants.IGUAL);
        exprAditiva.add(CompiladorAulaConstants.DIFERENTE);
        exprAditiva.addAll(exprRel);

        exprAditivaLinha.addAll(exprAditiva);

        exprMultiplicativa.add(CompiladorAulaConstants.SOMA);
        exprMultiplicativa.add(CompiladorAulaConstants.SUBTRACAO);
        exprMultiplicativa.addAll(exprAditiva);
        
        exprMultiplicativaLinha.addAll(exprMultiplicativa);

       
        exprUnaria.add(CompiladorAulaConstants.MULTIPLICACAO);
        exprUnaria.add(CompiladorAulaConstants.DIVISAO);
        exprUnaria.addAll(exprMultiplicativa);

        
        exprPrimaria.addAll(exprUnaria);
        
        
    }
}
