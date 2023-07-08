package gLabInheritanceandObjectTypeCasting;

public class Boy extends Person{
static double ageFactor=1.1;

@Override
public String talk() {
	
	return("...but I love Java class.");
}

@Override
public String walk() {
	return ("I amnow walking");
}
}
