package lessons.homeworks.tasks170712;

import mytestframework.Asserts;

public class MyStackTest
{
    public static void main(String[] args)
    {
        MyStack<String> stack = new MyStack<>();

        Asserts.assertEquals(stack.push("one"), true);
    }
}
