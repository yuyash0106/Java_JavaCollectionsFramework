package local.hal.night.javacollections.Chap03;

import java.util.ArrayList;

/**
 * JavaCollectionFramework Lesson Chap03 Src02
 *
 * List+Entityを使った実行クラス。
 *
 * @author yuyas
 */
public class UseListAndEntity {
	public static void main(String[] args) {
		ArrayList<PersonalData> personList = new ArrayList<>();

		PersonalData taro = new PersonalData(46887, "Taro", 72.8, 167.3, 23, 1);
		personList.add(taro);
		PersonalData jiro = new PersonalData(12457, "Jiro", 57.7, 170.4, 28, 1);
		personList.add(jiro);
		PersonalData hanako = new PersonalData(63544, "Hanako", 53.1, 155.4, 19, 0);
		personList.add(hanako);
		PersonalData keisuke = new PersonalData(34544, "Keisuke", 98.4, 192.4, 35, 1);
		personList.add(keisuke);

		System.out.println("---------中身を見てみよう---------");

		for (PersonalData person : personList) {
			Integer id = person.getId();
			String name = person.getName();
			Double height = person.getHeight();
			Double weight = person.getWeight();

			StringBuilder sbCurry = new StringBuilder();
			sbCurry.append("会員ID　");
			sbCurry.append(id);
			sbCurry.append("の人");
			sbCurry.append("名前＝");
			sbCurry.append(name);
			sbCurry.append("；　");
			sbCurry.append("身長＝");
			sbCurry.append(height);
			sbCurry.append("cm;");
			sbCurry.append("体重＝");
			sbCurry.append(weight);
			sbCurry.append("kg");

			System.out.println(sbCurry.toString());
		}
	}
}
