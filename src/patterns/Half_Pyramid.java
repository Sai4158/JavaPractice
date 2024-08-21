package patterns;
//Half pyramid
import java.util.Iterator;

public class Half_Pyramid {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
//			make sure to leave a empty space
			System.out.println();
		}
	}
}
//*
//**
//***
//****
//*****