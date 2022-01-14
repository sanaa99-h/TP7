package ma.education.tp6.annotations;

import java.lang.annotation.Target;

@Target (ElementType.TYPE)
public @interface Programmer {
	abstract int id();
	String name();

}
