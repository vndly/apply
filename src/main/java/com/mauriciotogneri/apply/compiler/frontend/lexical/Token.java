package com.mauriciotogneri.apply.compiler.frontend.lexical;

import com.mauriciotogneri.apply.compiler.types.TokenType;

public class Token implements Position
{
    private final TokenType type;
    private final Lexeme lexeme;

    public Token(TokenType type, Lexeme lexeme)
    {
        this.lexeme = lexeme;
        this.type = type;
    }

    public Token(TokenType type, Character character)
    {
        this(type, new Lexeme(character));
    }

    public boolean separator()
    {
        return (type == TokenType.SPACE) || //
                (type == TokenType.TAB);
    }

    private boolean literal()
    {
        return (type == TokenType.INTEGER) || //
                (type == TokenType.FLOAT) || //
                (type == TokenType.STRING) || //
                (type == TokenType.BOOLEAN);
    }

    private boolean arithmetic()
    {
        return (type == TokenType.ARITHMETIC_ADDITION) || //
                (type == TokenType.ARITHMETIC_SUBTRACTION) || //
                (type == TokenType.ARITHMETIC_MULTIPLICATION) || //
                (type == TokenType.ARITHMETIC_DIVISION) || //
                (type == TokenType.ARITHMETIC_POWER) || //
                (type == TokenType.ARITHMETIC_MODULE) || //
                (type == TokenType.ARITHMETIC_INCREMENT) || //
                (type == TokenType.ARITHMETIC_DECREMENT);
    }

    private boolean logic()
    {
        return (type == TokenType.LOGIC_EQUAL) || //
                (type == TokenType.LOGIC_NOT_EQUAL) || //
                (type == TokenType.LOGIC_GREATER) || //
                (type == TokenType.LOGIC_GREATER_EQUAL) || //
                (type == TokenType.LOGIC_LESS) || //
                (type == TokenType.LOGIC_LESS_EQUAL) || //
                (type == TokenType.LOGIC_AND) || //
                (type == TokenType.LOGIC_OR) || //
                (type == TokenType.LOGIC_NEGATION);
    }

    private boolean conditional()
    {
        return (type == TokenType.CONDITIONAL_IF);
    }

    private boolean array()
    {
        return (type == TokenType.ARRAY_INDEX) || //
                (type == TokenType.ARRAY_REMOVE) || //
                (type == TokenType.ARRAY_LENGTH);
    }

    private boolean list()
    {
        return (type == TokenType.LIST_OPEN) || //
                (type == TokenType.LIST_CLOSE);
    }

    public boolean primitive()
    {
        return conditional() || //
                arithmetic() || //
                logic() || //
                array() || //
                list();
    }

    public boolean expression()
    {
        return (type == TokenType.SYMBOL) || //
                conditional() || //
                literal() || //
                arithmetic() || //
                logic() || //
                array() || //
                list();
    }

    @Override
    public int line()
    {
        return lexeme.line();
    }

    @Override
    public int column()
    {
        return lexeme.column();
    }

    @Override
    public String toString()
    {
        return lexeme.toString();
    }
}