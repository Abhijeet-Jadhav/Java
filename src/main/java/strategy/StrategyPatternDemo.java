package strategy;
/*
 *  In Strategy pattern, a class behavior or its algorithm can be changed at run time.
 *  we create objects which represent various strategies and a context object whose 
 *  behavior varies as per its strategy object. 
 *  The strategy object changes the executing algorithm of the context object.
 *  
 *  strategy is doOperation() which is declared in interface
 *  OperationAdd, operationSub, OperationMul are concrete strategies 
 *  
 *  context object below, its behaviors varies according to the concrete strategy object passed to it
 *  
 */

public class StrategyPatternDemo {
	public static void main(String[] args) {
      Context context = new Context(new OperationAdd());		
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubstract());		
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());		
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
   }
}
