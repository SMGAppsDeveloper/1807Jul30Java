package package1;

public class tuesdayexamples {
	
public void loops(int n) {
	for (int i = 0; i <= n; i++) {
		System.out.println(i);
	}
}

//enhanced loop also called 'for each' loop
public void enhancedFor(int... n) {
	for(int num : n) {
		System.out.println(num);
	}
}


public void whileLoop(int n) {
	int x = 0;
	while(x < n) {
		x++;
		System.out.println(x);
	}
}

public void doWhile(int n) {
	do {
		System.out.println(n);
		n++;
	}
	while(n < 10);
}

public void ifStatement(int n) {
	if (n >= 2) {
		System.out.println("it's working");
	}
	else if ((n < 2) && (n > 0)) {
		System.out.println("it still works");
	}
	else {
		System.out.println("it's zero");
	}
}

public void switchFunction(int n) {
	switch (n) {
	case 1 :
		System.out.println("thing 1");
	case 2 :
		System.out.println("thing 2");
		break;
	
	}
}

public String visibleString = "you are allowed to see this one";

private String invisibleString = "if you are seeing this, you must have a getter";

public String getInvisibleString() {
	return invisibleString;
}

public void setInvisibleString(String invisibleString) {
	this.invisibleString = invisibleString;
}

public static void main(String[] args) {
	tuesdayexamples te = new tuesdayexamples();
//	te.loops(10);
//	te.enhancedFor(12, 23, 34);
//	te.whileLoop(10);
//	te.doWhile(1);
//	te.ifStatement(0);
	te.switchFunction(1);
	
}

}
