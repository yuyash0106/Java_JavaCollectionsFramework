package local.hal.night.javacollections.Chap03;

/**
 * JavaCollectionFramework Lesson Chap03 Src01
 *
 * 個人情報を保持するエンティティクラス。
 *
 * @author yuyas
 */
public class PersonalData {
	/**
	 * ID
	 */
	private Integer _id;
	/**
	 * 名前
	 */
	private String _name;
	/**
	 * 体重
	 */
	private Double _weight;
	/**
	 * 身長
	 */
	private Double _height;
	/**
	 * 年齢
	 */
	private Integer _age;
	/**
	 * 性別
	 * 1=♂,0=♀
	 */
	private Integer _sex;

	/**
	 * コンストラクタ。全データをセットする必要がある。
	 *
	 * @param id ID
	 * @param name 名前
	 * @param weight 体重
	 * @param height 身長
	 * @param age 年齢。
	 * @param sex 性別。1=♂、0=♀。
	 */
	public PersonalData(Integer id, String name, Double weight, Double height, Integer age, Integer sex) {
		_id = id;
		_name = name;
		_weight = weight;
		_height = height;
		_age = age;
		_sex = sex;
	}

	//以下、アクセサメソッド。
	public Integer getId() {
		return _id;
	}

	public void setId(Integer id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public Double getWeight() {
		return _weight;
	}

	public void setWeight(Double weight) {
		_weight = weight;
	}

	public Double getHeight() {
		return _height;
	}

	public void setHeight(Double height) {
		_height = height;
	}

	public Integer getAge() {
		return _age;
	}

	public void setAge(Integer age) {
		_age = age;
	}

	public Integer getSex() {
		return _sex;
	}

	public void setSex(Integer sex) {
		_sex = sex;
	}
}
