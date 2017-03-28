/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-3-27")
public class GetResult implements libthrift091.TBase<GetResult, GetResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetResult> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GetResult");

  private static final libthrift091.protocol.TField ITEM_FIELD_DESC = new libthrift091.protocol.TField("item", libthrift091.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetResultTupleSchemeFactory());
  }

  public Map<String,Datum> item; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    ITEM((short)1, "item");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ITEM
          return ITEM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.ITEM};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ITEM, new libthrift091.meta_data.FieldMetaData("item", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.MAP        , "Dictionary")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GetResult.class, metaDataMap);
  }

  public GetResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetResult(GetResult other) {
    if (other.isSetItem()) {
      this.item = other.item;
    }
  }

  public GetResult deepCopy() {
    return new GetResult(this);
  }

  @Override
  public void clear() {
    this.item = null;
  }

  public int getItemSize() {
    return (this.item == null) ? 0 : this.item.size();
  }

  public void putToItem(String key, Datum val) {
    if (this.item == null) {
      this.item = new HashMap<String,Datum>();
    }
    this.item.put(key, val);
  }

  public Map<String,Datum> getItem() {
    return this.item;
  }

  public GetResult setItem(Map<String,Datum> item) {
    this.item = item;
    return this;
  }

  public void unsetItem() {
    this.item = null;
  }

  /** Returns true if field item is set (has been assigned a value) and false otherwise */
  public boolean isSetItem() {
    return this.item != null;
  }

  public void setItemIsSet(boolean value) {
    if (!value) {
      this.item = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ITEM:
      if (value == null) {
        unsetItem();
      } else {
        setItem((Map<String,Datum>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ITEM:
      return getItem();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ITEM:
      return isSetItem();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetResult)
      return this.equals((GetResult)that);
    return false;
  }

  public boolean equals(GetResult that) {
    if (that == null)
      return false;

    boolean this_present_item = true && this.isSetItem();
    boolean that_present_item = true && that.isSetItem();
    if (this_present_item || that_present_item) {
      if (!(this_present_item && that_present_item))
        return false;
      if (!this.item.equals(that.item))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_item = true && (isSetItem());
    list.add(present_item);
    if (present_item)
      list.add(item);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetItem()).compareTo(other.isSetItem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItem()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.item, other.item);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetResult(");
    boolean first = true;

    if (isSetItem()) {
      sb.append("item:");
      if (this.item == null) {
        sb.append("null");
      } else {
        sb.append(this.item);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetResultStandardSchemeFactory implements SchemeFactory {
    public GetResultStandardScheme getScheme() {
      return new GetResultStandardScheme();
    }
  }

  private static class GetResultStandardScheme extends StandardScheme<GetResult> {

    public void read(libthrift091.protocol.TProtocol iprot, GetResult struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ITEM
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map234 = iprot.readMapBegin();
                struct.item = new HashMap<String,Datum>(2*_map234.size);
                String _key235;
                Datum _val236;
                for (int _i237 = 0; _i237 < _map234.size; ++_i237)
                {
                  _key235 = iprot.readString();
                  _val236 = new Datum();
                  _val236.read(iprot);
                  struct.item.put(_key235, _val236);
                }
                iprot.readMapEnd();
              }
              struct.setItemIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, GetResult struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.item != null) {
        if (struct.isSetItem()) {
          oprot.writeFieldBegin(ITEM_FIELD_DESC);
          {
            oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.item.size()));
            for (Map.Entry<String, Datum> _iter238 : struct.item.entrySet())
            {
              oprot.writeString(_iter238.getKey());
              _iter238.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetResultTupleSchemeFactory implements SchemeFactory {
    public GetResultTupleScheme getScheme() {
      return new GetResultTupleScheme();
    }
  }

  private static class GetResultTupleScheme extends TupleScheme<GetResult> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GetResult struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetItem()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetItem()) {
        {
          oprot.writeI32(struct.item.size());
          for (Map.Entry<String, Datum> _iter239 : struct.item.entrySet())
          {
            oprot.writeString(_iter239.getKey());
            _iter239.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GetResult struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TMap _map240 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.item = new HashMap<String,Datum>(2*_map240.size);
          String _key241;
          Datum _val242;
          for (int _i243 = 0; _i243 < _map240.size; ++_i243)
          {
            _key241 = iprot.readString();
            _val242 = new Datum();
            _val242.read(iprot);
            struct.item.put(_key241, _val242);
          }
        }
        struct.setItemIsSet(true);
      }
    }
  }

}

