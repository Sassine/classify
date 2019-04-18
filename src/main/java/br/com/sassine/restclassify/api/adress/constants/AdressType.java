package br.com.sassine.restclassify.api.adress.constants;

public enum AdressType {
	ATA,PUBLICATION;
	
	public static AdressType convertToEnum(String value){
    	for (AdressType item : AdressType.values()){
    		if(item.toString().equals(value))
    			return item;
    	}
    	return null;
    }
    
    public static String convertToString(AdressType value){
    	for (AdressType item : AdressType.values()){
    		if(item.equals(value))
    			return item.toString();
    	}
    	return null;
    }
}
