
public class PocketMon {

	//���赵 -> ���ϸ� ����
	
	
	//-> �̸�, Ÿ��, ���ݷ�, ü��(HP), ���� ->�Ӽ���
	
	private String name;
	private String type;
	private int attack;
	private int hp;
	private int defence;
	
	//������ �޼ҵ� ����� Ư¡
	//1.����Ÿ���� ���� = ��ȯ�����ʴ´� voidŸ�Ե� ����������
	//2.Ŭ������ �̸��� �޼ҵ��� �̸��� �����ϴ�.
	public PocketMon() {
		
	}
	//������ �Ű������� �־�� ������ �޼ҵ� ==> ����Ŭ�������� �����ڸ޼ҵ�� �ѹ��� ����ֱ����� �����ڸ޼ҵ�
	// ���ο��� ������ �Ű��������� �Ʒ��� �������ְ�, �����ͼ������� �׵����͸� ���� �Ӽ��鿡 ������ �����֤þ���.
	public PocketMon(String name, String type, int attack, int defence, int hp) {
		this.name = name;  //�� Ŭ������ �ִ� name������ �Ű����� �����ͷ� �޾ƿ� name�� �����ſ���~ �������ֱ�
		this.type = type;
		this.attack = attack;
		this.hp = hp;
		this.defence = defence;
	} 
	
	//��ȸ ������ ���� getter(������ͼ�Ȯ���Ҷ�)/setter(���� ���Ӱ� �����ϰų� �����Ҷ�)�޼ҵ� ����
	
	//���ϸ� �̸��� Ȯ���� �� �ִ� �޼ҵ� ����
	public String getName() {		//��ȯ�� ���ٰŴѱ� ��ȯŸ��String�� ����
		return name;   //���赵�ȿ��ִ� name���� ��ȯ�Ұž�.
	}
	public String getType() {
		return type;
	}
	public int getAttrack() {
		return attack;
	}
	public int getHp() {
		return hp;
	}
	public int getDefence() {
		return defence;
	}
	
	//���� �����ϰ���� ���� ������ ����Ŭ�������� �ٲ��ټ��ִ� �޼ҵ�  / int��� �Ű������� �޾ƿ��ڴ� �������ְ�
	//�̰Ͷ��� ���� Ŭ������ ���ð� �����༮�̴� �ű⿡ �־��ּ��� �ϰ� �������ֱ�
	public void setAttack(int attack) {
		this.attack = attack;
		
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	
}
