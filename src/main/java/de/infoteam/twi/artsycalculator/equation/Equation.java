package de.infoteam.twi.artsycalculator.equation;

import java.util.List;

public class Equation {

    public enum Operator {
        PLUS("+") {
            @Override
            public Integer calculate(Integer firstNumber, Integer secondNumber) {
                return firstNumber + secondNumber;
            }
        },
        MINUS("-") {
            @Override
            public Integer calculate(Integer firstNumber, Integer secondNumber) {
                return firstNumber - secondNumber;
            }
        };

        public abstract Integer calculate(Integer firstNumber, Integer secondNumber);
        private String text;

        Operator(String text) {
            this.text = text;
        }

        public static Boolean isOperator(String text) {
            return fromString(text) != null;
        }

        public static Operator fromString(String text) {
            for (Operator operator : Operator.values()) {
                if (operator.text.equalsIgnoreCase(text)) {
                    return operator;
                }
            }
            return null;
        }
    }

    public static class OperatorNumberTuple {
        Operator operator;
        Integer number;

        public OperatorNumberTuple(Operator operator, Integer number) {
            this.operator = operator;
            this.number = number;
        }

        public Operator getOperator() {
            return operator;
        }

        public Integer getNumber() {
            return number;
        }
    }

    Integer firstNumber;
    List<OperatorNumberTuple> tupleList;
    Integer result;

    Equation(Integer firstNumber, List<OperatorNumberTuple> ontList) {
        this.tupleList = ontList;
        this.firstNumber = firstNumber;
        calculate();
    }

    public String printEquation() {
        StringBuilder equation = new StringBuilder();
        equation.append(this.firstNumber);
        this.tupleList.stream().forEach(tuple -> equation.append(tuple.getOperator().text + tuple.getNumber()));
        equation.append("=" + result);
        return equation.toString();
    }

    private void calculate() {
        final Integer[] partResult = {this.firstNumber};
        this.tupleList.stream().forEach(tuple -> partResult[0] = tuple.getOperator().calculate(partResult[0], tuple.getNumber()));

        this.result = partResult[0];
    }
    
    public Integer getResult() {
        return result;
    }

}
