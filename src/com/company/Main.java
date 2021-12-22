package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
        String[] textLine = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                            "Аммос Федорович: Как ревизор?",
                            "Артемий Филиппович: Как ревизор?",
                            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                            "Аммос Федорович: Вот те на!",
                            "Артемий Филиппович: Вот не было заботы, так подай!",
                            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLine));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for(String role : roles){
            int number = 1;
            result.append(role);
            result.append(":");
            result.append("\n");
            for(int i = 0; i< textLines.length; i++){
                if(textLines[i].indexOf(role+":")==0){
                    result.append(i+1);
                    result.append(")");
                    result.append(textLines[i].substring(textLines[i].indexOf(':')+1));
                    result.append("\n");

                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}
