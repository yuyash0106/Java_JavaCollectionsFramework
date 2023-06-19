package local.hal.night.javacollections.Chap04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * JavaCollectionsFramework Lesson Chap04 Src01
 *
 * Mapの使い方サンプル。
 *
 * @author yuyas
 */
public class UseMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		System.out.println("現在の要素数は" + map.size() + "コです");
		System.out.println("Mapは空ですか？：" + map.isEmpty());

		map.put(1, "谷部");
		map.put(3, "黒井");
		map.put(5, "金子");
		map.put(7, "井上");
		map.put(9, "山本");
		map.put(11, "中村");
		map.put(13, "朝付");
		map.put(15, "中島");
		map.put(17, "竹田");
		map.put(19, "木元");
		map.put(21, "飛松");
		map.put(23, "石原");
		map.put(25, "斎藤");
		map.put(27, "山古");
		map.put(29, "宮西");

		System.out.println("現在の要素数は" + map.size() + "コです");
		System.out.println("Mapは空ですか？：" + map.isEmpty());

		System.out.println("----------中身を見てみよう(Iterator版)---------");
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		for (Iterator<Map.Entry<Integer, String>> ite = entries.iterator(); ite.hasNext();) {
			Map.Entry<Integer, String> element = ite.next();
			Integer key = element.getKey();
			String value = element.getValue();
			System.out.println("key=" + key + ":value=" + value);
		}

		System.out.println("----------中身を見てみよう(便利版)---------");
		for (Map.Entry<Integer, String> element : map.entrySet()) {
			Integer key = element.getKey();
			String value = element.getValue();
			System.out.println("key=" + key + ":value=" + value);
		}

		String name = map.put(9, "中山");
		System.out.println(name + "さんを上書きしました");

		System.out.println("私は" + map.get(25) + "です。");
		System.out.println("No22はいますか？：" + map.containsKey(22));
		System.out.println("田中さんはいますか？：" + map.containsValue("田中"));

		for (Map.Entry<Integer, String> element : map.entrySet()) {
			System.out.println(element);
		}

		name = map.remove(25);
		System.out.println(name + "さんを抹消しました");
		for (Map.Entry<Integer, String> element : map.entrySet()) {
			System.out.println(element);
		}

		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}

		Collection<String> values = map.values();
		for (String eachName : values) {
			System.out.println(eachName);
		}
	}
}
