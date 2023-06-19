package local.hal.night.javacollections.Chap04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * JavaCollectionsFramework Lesson Chap04 Src02
 *
 * 3種のMapの違いサンプル。
 *
 * @author yuyas
 */
public class SeveralMapsSample {
	public static void main(String[] args) {
		String[] nos = { "05", "03", "09", "11", "01", "07" };
		String[] names = { "山古", "宮西", "中村", "長谷川", "三原", "斎藤" };
		HashMap<String, String> hashMap = new HashMap<>();
		TreeMap<String, String> treeMap = new TreeMap<>();
		LinkedHashMap<String, String> lHashMap = new LinkedHashMap<>();
		for (int i = 0; i < names.length; i++) {
			String no = nos[i];
			String name = names[i];
			hashMap.put(no, name);
			treeMap.put(no, name);
			lHashMap.put(no, name);
		}

		System.out.println("----HashMapの内容表示----");
		for (Map.Entry<String, String> element : hashMap.entrySet()) {
			System.out.println(element);
		}

		System.out.println("----TreeMapの内容表示----");
		for (Map.Entry<String, String> element : treeMap.entrySet()) {
			System.out.println(element);
		}

		System.out.println("----LinkedHashMapの内容表示----");
		for (Map.Entry<String, String> element : lHashMap.entrySet()) {
			System.out.println(element);
		}
	}
}
