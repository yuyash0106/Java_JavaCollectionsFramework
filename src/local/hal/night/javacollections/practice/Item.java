package local.hal.night.javacollections.practice;

import java.sql.Timestamp;

/**
 * JavaCollectionsFramework Lesson practice Src01
 *
 * 記事ひとつ分のデータを格納するエンティティクラス。
 *
 *
 * @author yuyas
 */
public class Item {
	/**
	 * 記事ID
	 */
	private Integer _id;
	/**
	 * 記事タイトル
	 */
	private String _title;
	/**
	 * 記事URL
	 */
	private String _url;
	/**
	 * 記事詳細
	 */
	private String _desc;
	/**
	 * 公開日時
	 */
	private Timestamp _pubDate;

	/**
	 * コンストラクタ。全データをセット。
	 * @param id ID
	 * @param title 記事タイトル
	 * @param url 記事URL
	 * @param desc 記事詳細
	 * @param pubdate 公開日時
	 */
	public Item(Integer id,String title,String url,String desc,Timestamp pubDate) {
		_id = id;
		_title = title;
		_url = url;
		_desc = desc;
		_pubDate = pubDate;
	}

	/**
	 * アクセサメソッド
	 */
	public Integer getId() {
		return _id;
	}

	public void setId(Integer id) {
		_id = id;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public String getDesc() {
		return _desc;
	}

	public void setDesc(String desc) {
		_desc = desc;
	}

	public Timestamp getPubdate() {
		return _pubDate;
	}
	public void setPubdate(Timestamp pubDate) {
		_pubDate = pubDate;
	}



}
