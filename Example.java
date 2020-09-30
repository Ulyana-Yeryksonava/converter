package com.company;

import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws JsonSerializationException, InvocationTargetException, IllegalAccessException {
        Person1 person = new Person1("aaa", "bbb", "25");
        ObjectToXMLConverter objectToXMLConverter = new ObjectToXMLConverter();
        String xmlString = objectToXMLConverter.convertToJson(person);
        System.out.println(xmlString);

//        Person person = new Person("aaa", "bbb", "25");
//        ObjectToJsonConverter objectToJsonConverter = new ObjectToJsonConverter();
//        String jsonString = objectToJsonConverter.convertToJson(person);
//        System.out.println(jsonString);
    }

//    @Test
//    public void givenObjectNotSerializedThenExceptionThrown() throws JsonSerializationException {
//        Object object = new Object();
//        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
//        assertThrows(JsonSerializationException.class, () -> {
//            serializer.convertToJson(object);
//        });
//    }
//
//    @Test
//    public void givenObjectSerializedThenTrueReturned() throws JsonSerializationException {
//        Person person = new Person("soufiane", "cheouati", "34");
//        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
//        String jsonString = serializer.convertToJson(person);
//        assertEquals("{\"personAge\":\"34\",\"firstName\":\"Soufiane\",\"lastName\":\"Cheouati\"}", jsonString);
//    }
}
