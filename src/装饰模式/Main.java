package 装饰模式;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) {
		Horse horse = new WriteHorse();
		horse =new HeightHorse(horse);
		horse.name(); 
	}
}
