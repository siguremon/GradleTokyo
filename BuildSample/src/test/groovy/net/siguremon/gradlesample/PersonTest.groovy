package net.siguremon.gradlesample

import org.junit.Test

class PersonTest {

  @Test
  void test_person_constructor() {
    Person p = new Person('siguremon', 18)
    assert p.name == 'siguremon'
    assert p.age == 18
  }
}
