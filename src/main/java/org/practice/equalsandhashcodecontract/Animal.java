package org.practice.equalsandhashcodecontract;

 public interface Animal { public default String getName() { return null; } }
 interface Mammal {  }
 abstract class Otter implements Mammal, Animal {



 }