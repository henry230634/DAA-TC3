
package lab3.calculadora;

public class Calculadora {
    
    public static double evaluar(String expr) {
        expr = expr.replaceAll("\\s+", "");
        
        int opIndice = encontrarOperador(expr);
        if (opIndice != -1) {
            char op = expr.charAt(opIndice);
            String izq = expr.substring(0, opIndice);
            String der = expr.substring(opIndice + 1);
            return operar(evaluar(izq), evaluar(der), op);
        }
        if (expr.endsWith("!")) {
            String numStr = expr.substring(0, expr.length() - 1);
            return factorial((int) evaluar(numStr));
        }
        return Double.parseDouble(expr);
    }

    private static int encontrarOperador(String expr) {
        int parenLevel = 0;
        int indice = -1;
        char operador = '\0';
        
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            
            if (c == '-' && (i == 0 || "+-*/^".indexOf(expr.charAt(i-1)) != -1)) {
                continue;
            }
            
            int prioridad = prioridadOperador(c);
            if (prioridad != -1 && prioridad >= prioridadOperador(operador)) {
                operador = c;
                indice = i;
            }
        }
        return indice;
    }

    private static int prioridadOperador(char op) {
        switch (op) {
            case '+':
            case '-': return 3; 
            case '*':
            case '/': return 2;
            case '^': return 1; 
            default: return -1; 
        }
    }

    private static double operar(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return producto(a,b);
            case '/': 
                if (b == 0) throw new ArithmeticException("División por cero");
                return a / b;
            case '^': return potencia(a, b);
            default: throw new IllegalArgumentException("Operador inválido: " + op);
        }
    }

    private static double factorial(int n) {
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    
    private static double producto(double a, double b) {
        if(b==1){
            return a;
        }else{
            return a + producto(a,b-1);
        }
    }

    
    private static double potencia(double base, double exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente % 2 == 0) {
            double temp = potencia(base, exponente / 2);
            return temp * temp;
        } else {
            double temp = potencia(base, (exponente-1) / 2);
            return base * temp * temp;
        }
    }
    
}