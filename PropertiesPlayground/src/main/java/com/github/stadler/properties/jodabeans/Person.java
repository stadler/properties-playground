package com.github.stadler.properties.jodabeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.google.common.collect.ImmutableList;

@BeanDefinition
public final class Person implements ImmutableBean {

  @PropertyDefinition(validate = "notNull")
  private final String firstName;
  
  @PropertyDefinition
  private final List<String> middleName;
  
  @PropertyDefinition(validate = "notNull")
  private final String lastName;
  
  @PropertyDefinition
  private final int age;

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code Person}.
   * @return the meta-bean, not null
   */
  public static Person.Meta meta() {
    return Person.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(Person.Meta.INSTANCE);
  }

  /**
   * Returns a builder used to create an instance of the bean.
   * @return the builder, not null
   */
  public static Person.Builder builder() {
    return new Person.Builder();
  }

  private Person(
      String firstName,
      List<String> middleName,
      String lastName,
      int age) {
    JodaBeanUtils.notNull(firstName, "firstName");
    JodaBeanUtils.notNull(lastName, "lastName");
    this.firstName = firstName;
    this.middleName = (middleName != null ? ImmutableList.copyOf(middleName) : null);
    this.lastName = lastName;
    this.age = age;
  }

  @Override
  public Person.Meta metaBean() {
    return Person.Meta.INSTANCE;
  }

  @Override
  public <R> Property<R> property(String propertyName) {
    return metaBean().<R>metaProperty(propertyName).createProperty(this);
  }

  @Override
  public Set<String> propertyNames() {
    return metaBean().metaPropertyMap().keySet();
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the firstName.
   * @return the value of the property, not null
   */
  public String getFirstName() {
    return firstName;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the middleName.
   * @return the value of the property
   */
  public List<String> getMiddleName() {
    return middleName;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the lastName.
   * @return the value of the property, not null
   */
  public String getLastName() {
    return lastName;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the age.
   * @return the value of the property
   */
  public int getAge() {
    return age;
  }

  //-----------------------------------------------------------------------
  /**
   * Returns a builder that allows this bean to be mutated.
   * @return the mutable builder, not null
   */
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      Person other = (Person) obj;
      return JodaBeanUtils.equal(getFirstName(), other.getFirstName()) &&
          JodaBeanUtils.equal(getMiddleName(), other.getMiddleName()) &&
          JodaBeanUtils.equal(getLastName(), other.getLastName()) &&
          (getAge() == other.getAge());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(getFirstName());
    hash = hash * 31 + JodaBeanUtils.hashCode(getMiddleName());
    hash = hash * 31 + JodaBeanUtils.hashCode(getLastName());
    hash = hash * 31 + JodaBeanUtils.hashCode(getAge());
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(160);
    buf.append("Person{");
    buf.append("firstName").append('=').append(getFirstName()).append(',').append(' ');
    buf.append("middleName").append('=').append(getMiddleName()).append(',').append(' ');
    buf.append("lastName").append('=').append(getLastName()).append(',').append(' ');
    buf.append("age").append('=').append(JodaBeanUtils.toString(getAge()));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code Person}.
   */
  public static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code firstName} property.
     */
    private final MetaProperty<String> firstName = DirectMetaProperty.ofImmutable(
        this, "firstName", Person.class, String.class);
    /**
     * The meta-property for the {@code middleName} property.
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    private final MetaProperty<List<String>> middleName = DirectMetaProperty.ofImmutable(
        this, "middleName", Person.class, (Class) List.class);
    /**
     * The meta-property for the {@code lastName} property.
     */
    private final MetaProperty<String> lastName = DirectMetaProperty.ofImmutable(
        this, "lastName", Person.class, String.class);
    /**
     * The meta-property for the {@code age} property.
     */
    private final MetaProperty<Integer> age = DirectMetaProperty.ofImmutable(
        this, "age", Person.class, Integer.TYPE);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "firstName",
        "middleName",
        "lastName",
        "age");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 132835675:  // firstName
          return firstName;
        case -818219584:  // middleName
          return middleName;
        case -1459599807:  // lastName
          return lastName;
        case 96511:  // age
          return age;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public Person.Builder builder() {
      return new Person.Builder();
    }

    @Override
    public Class<? extends Person> beanType() {
      return Person.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code firstName} property.
     * @return the meta-property, not null
     */
    public MetaProperty<String> firstName() {
      return firstName;
    }

    /**
     * The meta-property for the {@code middleName} property.
     * @return the meta-property, not null
     */
    public MetaProperty<List<String>> middleName() {
      return middleName;
    }

    /**
     * The meta-property for the {@code lastName} property.
     * @return the meta-property, not null
     */
    public MetaProperty<String> lastName() {
      return lastName;
    }

    /**
     * The meta-property for the {@code age} property.
     * @return the meta-property, not null
     */
    public MetaProperty<Integer> age() {
      return age;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 132835675:  // firstName
          return ((Person) bean).getFirstName();
        case -818219584:  // middleName
          return ((Person) bean).getMiddleName();
        case -1459599807:  // lastName
          return ((Person) bean).getLastName();
        case 96511:  // age
          return ((Person) bean).getAge();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code Person}.
   */
  public static final class Builder extends DirectFieldsBeanBuilder<Person> {

    private String firstName;
    private List<String> middleName;
    private String lastName;
    private int age;

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    /**
     * Restricted copy constructor.
     * @param beanToCopy  the bean to copy from, not null
     */
    private Builder(Person beanToCopy) {
      this.firstName = beanToCopy.getFirstName();
      this.middleName = (beanToCopy.getMiddleName() != null ? new ArrayList<String>(beanToCopy.getMiddleName()) : null);
      this.lastName = beanToCopy.getLastName();
      this.age = beanToCopy.getAge();
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 132835675:  // firstName
          return firstName;
        case -818219584:  // middleName
          return middleName;
        case -1459599807:  // lastName
          return lastName;
        case 96511:  // age
          return age;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 132835675:  // firstName
          this.firstName = (String) newValue;
          break;
        case -818219584:  // middleName
          this.middleName = (List<String>) newValue;
          break;
        case -1459599807:  // lastName
          this.lastName = (String) newValue;
          break;
        case 96511:  // age
          this.age = (Integer) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public Builder set(MetaProperty<?> property, Object value) {
      super.set(property, value);
      return this;
    }

    @Override
    public Builder setString(String propertyName, String value) {
      setString(meta().metaProperty(propertyName), value);
      return this;
    }

    @Override
    public Builder setString(MetaProperty<?> property, String value) {
      super.setString(property, value);
      return this;
    }

    @Override
    public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
      super.setAll(propertyValueMap);
      return this;
    }

    @Override
    public Person build() {
      return new Person(
          firstName,
          middleName,
          lastName,
          age);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets the {@code firstName} property in the builder.
     * @param firstName  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder firstName(String firstName) {
      JodaBeanUtils.notNull(firstName, "firstName");
      this.firstName = firstName;
      return this;
    }

    /**
     * Sets the {@code middleName} property in the builder.
     * @param middleName  the new value
     * @return this, for chaining, not null
     */
    public Builder middleName(List<String> middleName) {
      this.middleName = middleName;
      return this;
    }

    /**
     * Sets the {@code middleName} property in the builder
     * from an array of objects.
     * @param middleName  the new value
     * @return this, for chaining, not null
     */
    public Builder middleName(String... middleName) {
      return middleName(Arrays.asList(middleName));
    }

    /**
     * Sets the {@code lastName} property in the builder.
     * @param lastName  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder lastName(String lastName) {
      JodaBeanUtils.notNull(lastName, "lastName");
      this.lastName = lastName;
      return this;
    }

    /**
     * Sets the {@code age} property in the builder.
     * @param age  the new value
     * @return this, for chaining, not null
     */
    public Builder age(int age) {
      this.age = age;
      return this;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(160);
      buf.append("Person.Builder{");
      buf.append("firstName").append('=').append(JodaBeanUtils.toString(firstName)).append(',').append(' ');
      buf.append("middleName").append('=').append(JodaBeanUtils.toString(middleName)).append(',').append(' ');
      buf.append("lastName").append('=').append(JodaBeanUtils.toString(lastName)).append(',').append(' ');
      buf.append("age").append('=').append(JodaBeanUtils.toString(age));
      buf.append('}');
      return buf.toString();
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}
