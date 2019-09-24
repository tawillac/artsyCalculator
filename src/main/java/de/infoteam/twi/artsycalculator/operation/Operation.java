package de.infoteam.twi.artsycalculator.operation;

public class Operation {

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

        public static Operator fromString(String text) {
            for (Operator operator : Operator.values()) {
                if (operator.text.equalsIgnoreCase(text)) {
                    return operator;
                }
            }
            return null;
        }
    }

    Integer firstNumber;
    Integer secondNumber;
    Operator operator;
    Integer result;

    public Operation(Integer firstNumber, Operator operator, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.operator = operator;
        this.secondNumber = secondNumber;
        calculate();
    }

    public Operation(String[] args) {
        this (Integer.parseInt(args[0]), Operator.fromString(args[1]),  Integer.parseInt(args[2]));
    }

    public String toString() {
        return this.firstNumber + this.operator.text + this.secondNumber + "=" + result;
    }

    private void calculate() {
        this.result = this.operator.calculate(this.firstNumber, this.secondNumber);
    }

    public static boolean isValidOperation(String[] args) {
        if (args.length != 3) {
            return false;
        } else {
            try {
                Integer.parseInt(args[0]);
                Integer.parseInt(args[2]);
            }
            catch(NumberFormatException nfe) {
                System.err.println(nfe.getMessage());
                return false;
            }

            if (!(args[1].equals("+") || args[1].equals("-"))) {
                return false;
            }
            return true;
        }
    }

    public Integer getFirstNumber() {
        return firstNumber;
    }

    public Integer getSecondNumber() {
        return secondNumber;
    }


    public Operator getOperator() {
        return operator;
    }


    public Integer getResult() {
        return result;
    }

}
