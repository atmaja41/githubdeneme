package overriding;

public class BaseKrediManager {
	//final eklersek bu metodun üstüne override edilmez 
	public double hesapla(double tutar) { 
		return tutar * 1.18;
	}
}
