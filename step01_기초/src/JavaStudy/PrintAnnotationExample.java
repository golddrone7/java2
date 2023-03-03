package JavaStudy;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] declaredMethod = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethod) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printannotation = method.getAnnotation(PrintAnnotation.class);
				System.out.println("[ "+method.getName()+"  ]");
				for(int i=0; i<printannotation.number(); i++) {
					System.out.print(printannotation.value());
				}
				System.out.println();
				try {
					method.invoke(new Service());
				} catch(Exception e) {}
				System.out.println();
			}
		}
	}

}
