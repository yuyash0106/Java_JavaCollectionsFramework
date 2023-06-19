package local.hal.night.javacollections.practice;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class ShowItem {
	public static void main(String[] args) {
		Map<Integer,Item> show = new HashMap<>();
		Item news1 = new Item(12, "ビデオ会議の「Zoom」と勘違い……？　日本の音楽機器メーカー「ズーム」の株価が一時ストップ高", "https://nlab.itmedia.co.jp/nl/articles/2006/05/news153.html", "6月5日の株式市場で、音楽用電子機器メーカーである「ズーム」" +
				"（東証JASDAQスタンダード）が一時ストップ高となり、年初来高値を更新しました。業績の拡大予想を発表したビデオ会議サービスの米企業と勘違いされたのではないかという指摘があります。" +
				"", Timestamp.valueOf("2020-06-05 18:38:00 "));
		Item news2 = new Item(34, "オンラインで「推し」と1対1で話せるサービス、LINEが8月スタート", "https://nlab.itmedia.co.jp/nl/articles/2006/05/news153.html", "LINEは8月に、ライブ配信サービス「LINE LIVE」の機能を活用した、アーティストやアイドルと1対1で話せるチケット制ライブサービス「LINE Face2Face powered by LINE LIVE」をスタートします。",Timestamp.valueOf("2020-06-05 18:27:00"));
		Item news3 = new Item(56, "ローソン、「プレミアムロールケーキ」が2倍になった「プレミアムロールケーキ×2」", "https://nlab.itmedia.co.jp/nl/articles/2006/05/news152.html", "ローソンは6月から毎月、5～6日に「プレミアムロールケーキ×2」を発売します。定番のプレミアムロールケーキを、重量（内容量）と厚さを2倍にした商品です。",Timestamp.valueOf("2020-06-05 18:15:00 "));
		Item news4 = new Item(78, "生田斗真と清野菜名が結婚を発表　「より一層俳優業に邁進して参りたいと決意」", "https://nlab.itmedia.co.jp/nl/articles/2006/04/news118.html", "俳優の生田斗真さんと女優の清野菜名さんが6月5日、結婚したことをジャニーズ事務所を通じて連名で発表しました。\r\n" +
				"",Timestamp.valueOf("2020-06-05 17:36:00 "));

		show.put(1,news1);
		show.put(2,news2);
		show.put(3,news3);
		show.put(4,news4);

		System.out.println("---------ヘッドライン---------");
		for(Map.Entry<Integer, Item> element :show.entrySet()) {
			Integer key = element.getKey();
			Item item = element.getValue();

			StringBuffer sbCurry = new StringBuffer();
			sbCurry.append("---------記事ID：");
			sbCurry.append(key);
			sbCurry.append(item.getId());
			sbCurry.append("\n");
			sbCurry.append("■");
			sbCurry.append(item.getTitle());
			sbCurry.append("\n");
			sbCurry.append("[");
			sbCurry.append(item.getPubdate());
			sbCurry.append("]");
			sbCurry.append("\n");
			sbCurry.append(item.getDesc());
			sbCurry.append("\n");
			sbCurry.append(item.getUrl());

			System.out.println(sbCurry.toString());
		}
	}
}
