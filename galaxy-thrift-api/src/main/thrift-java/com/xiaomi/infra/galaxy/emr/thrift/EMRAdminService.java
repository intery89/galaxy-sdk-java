/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-23")
public class EMRAdminService {

  public interface Iface {

    public List<TimeSeriesData> queryMetric(MetricQueryRequest request) throws com.xiaomi.infra.galaxy.rpc.thrift.ServiceException, libthrift091.TException;

  }

  public interface AsyncIface {

    public void queryMetric(MetricQueryRequest request, libthrift091.async.AsyncMethodCallback resultHandler) throws libthrift091.TException;

  }

  public static class Client extends libthrift091.TServiceClient implements Iface {
    public static class Factory implements libthrift091.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(libthrift091.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(libthrift091.protocol.TProtocol iprot, libthrift091.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(libthrift091.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(libthrift091.protocol.TProtocol iprot, libthrift091.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public List<TimeSeriesData> queryMetric(MetricQueryRequest request) throws com.xiaomi.infra.galaxy.rpc.thrift.ServiceException, libthrift091.TException
    {
      send_queryMetric(request);
      return recv_queryMetric();
    }

    public void send_queryMetric(MetricQueryRequest request) throws libthrift091.TException
    {
      queryMetric_args args = new queryMetric_args();
      args.setRequest(request);
      sendBase("queryMetric", args);
    }

    public List<TimeSeriesData> recv_queryMetric() throws com.xiaomi.infra.galaxy.rpc.thrift.ServiceException, libthrift091.TException
    {
      queryMetric_result result = new queryMetric_result();
      receiveBase(result, "queryMetric");
      if (result.isSetSuccess()) {
        return result.success;
      }
      if (result.se != null) {
        throw result.se;
      }
      throw new libthrift091.TApplicationException(libthrift091.TApplicationException.MISSING_RESULT, "queryMetric failed: unknown result");
    }

  }
  public static class AsyncClient extends libthrift091.async.TAsyncClient implements AsyncIface {
    public static class Factory implements libthrift091.async.TAsyncClientFactory<AsyncClient> {
      private libthrift091.async.TAsyncClientManager clientManager;
      private libthrift091.protocol.TProtocolFactory protocolFactory;
      public Factory(libthrift091.async.TAsyncClientManager clientManager, libthrift091.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(libthrift091.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(libthrift091.protocol.TProtocolFactory protocolFactory, libthrift091.async.TAsyncClientManager clientManager, libthrift091.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void queryMetric(MetricQueryRequest request, libthrift091.async.AsyncMethodCallback resultHandler) throws libthrift091.TException {
      checkReady();
      queryMetric_call method_call = new queryMetric_call(request, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class queryMetric_call extends libthrift091.async.TAsyncMethodCall {
      private MetricQueryRequest request;
      public queryMetric_call(MetricQueryRequest request, libthrift091.async.AsyncMethodCallback resultHandler, libthrift091.async.TAsyncClient client, libthrift091.protocol.TProtocolFactory protocolFactory, libthrift091.transport.TNonblockingTransport transport) throws libthrift091.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.request = request;
      }

      public void write_args(libthrift091.protocol.TProtocol prot) throws libthrift091.TException {
        prot.writeMessageBegin(new libthrift091.protocol.TMessage("queryMetric", libthrift091.protocol.TMessageType.CALL, 0));
        queryMetric_args args = new queryMetric_args();
        args.setRequest(request);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public List<TimeSeriesData> getResult() throws com.xiaomi.infra.galaxy.rpc.thrift.ServiceException, libthrift091.TException {
        if (getState() != libthrift091.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        libthrift091.transport.TMemoryInputTransport memoryTransport = new libthrift091.transport.TMemoryInputTransport(getFrameBuffer().array());
        libthrift091.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_queryMetric();
      }
    }

  }

  public static class Processor<I extends Iface> extends libthrift091.TBaseProcessor<I> implements libthrift091.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, libthrift091.ProcessFunction<I, ? extends libthrift091.TBase>>()));
    }

    protected Processor(I iface, Map<String,  libthrift091.ProcessFunction<I, ? extends  libthrift091.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  libthrift091.ProcessFunction<I, ? extends  libthrift091.TBase>> getProcessMap(Map<String,  libthrift091.ProcessFunction<I, ? extends  libthrift091.TBase>> processMap) {
      processMap.put("queryMetric", new queryMetric());
      return processMap;
    }

    public static class queryMetric<I extends Iface> extends libthrift091.ProcessFunction<I, queryMetric_args> {
      public queryMetric() {
        super("queryMetric");
      }

      public queryMetric_args getEmptyArgsInstance() {
        return new queryMetric_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public queryMetric_result getResult(I iface, queryMetric_args args) throws libthrift091.TException {
        queryMetric_result result = new queryMetric_result();
        try {
          result.success = iface.queryMetric(args.request);
        } catch (com.xiaomi.infra.galaxy.rpc.thrift.ServiceException se) {
          result.se = se;
        }
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends libthrift091.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, libthrift091.AsyncProcessFunction<I, ? extends libthrift091.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  libthrift091.AsyncProcessFunction<I, ? extends  libthrift091.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  libthrift091.AsyncProcessFunction<I, ? extends  libthrift091.TBase,?>> getProcessMap(Map<String,  libthrift091.AsyncProcessFunction<I, ? extends  libthrift091.TBase, ?>> processMap) {
      processMap.put("queryMetric", new queryMetric());
      return processMap;
    }

    public static class queryMetric<I extends AsyncIface> extends libthrift091.AsyncProcessFunction<I, queryMetric_args, List<TimeSeriesData>> {
      public queryMetric() {
        super("queryMetric");
      }

      public queryMetric_args getEmptyArgsInstance() {
        return new queryMetric_args();
      }

      public AsyncMethodCallback<List<TimeSeriesData>> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final libthrift091.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<List<TimeSeriesData>>() { 
          public void onComplete(List<TimeSeriesData> o) {
            queryMetric_result result = new queryMetric_result();
            result.success = o;
            try {
              fcall.sendResponse(fb,result, libthrift091.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = libthrift091.protocol.TMessageType.REPLY;
            libthrift091.TBase msg;
            queryMetric_result result = new queryMetric_result();
            if (e instanceof com.xiaomi.infra.galaxy.rpc.thrift.ServiceException) {
                        result.se = (com.xiaomi.infra.galaxy.rpc.thrift.ServiceException) e;
                        result.setSeIsSet(true);
                        msg = result;
            }
             else 
            {
              msgType = libthrift091.protocol.TMessageType.EXCEPTION;
              msg = (libthrift091.TBase)new libthrift091.TApplicationException(libthrift091.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, queryMetric_args args, libthrift091.async.AsyncMethodCallback<List<TimeSeriesData>> resultHandler) throws TException {
        iface.queryMetric(args.request,resultHandler);
      }
    }

  }

  public static class queryMetric_args implements libthrift091.TBase<queryMetric_args, queryMetric_args._Fields>, java.io.Serializable, Cloneable, Comparable<queryMetric_args>   {
    private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("queryMetric_args");

    private static final libthrift091.protocol.TField REQUEST_FIELD_DESC = new libthrift091.protocol.TField("request", libthrift091.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new queryMetric_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new queryMetric_argsTupleSchemeFactory());
    }

    public MetricQueryRequest request; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements libthrift091.TFieldIdEnum {
      REQUEST((short)1, "request");

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
          case 1: // REQUEST
            return REQUEST;
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
    public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.REQUEST, new libthrift091.meta_data.FieldMetaData("request", libthrift091.TFieldRequirementType.DEFAULT, 
          new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, MetricQueryRequest.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(queryMetric_args.class, metaDataMap);
    }

    public queryMetric_args() {
    }

    public queryMetric_args(
      MetricQueryRequest request)
    {
      this();
      this.request = request;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public queryMetric_args(queryMetric_args other) {
      if (other.isSetRequest()) {
        this.request = new MetricQueryRequest(other.request);
      }
    }

    public queryMetric_args deepCopy() {
      return new queryMetric_args(this);
    }

    @Override
    public void clear() {
      this.request = null;
    }

    public MetricQueryRequest getRequest() {
      return this.request;
    }

    public queryMetric_args setRequest(MetricQueryRequest request) {
      this.request = request;
      return this;
    }

    public void unsetRequest() {
      this.request = null;
    }

    /** Returns true if field request is set (has been assigned a value) and false otherwise */
    public boolean isSetRequest() {
      return this.request != null;
    }

    public void setRequestIsSet(boolean value) {
      if (!value) {
        this.request = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case REQUEST:
        if (value == null) {
          unsetRequest();
        } else {
          setRequest((MetricQueryRequest)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case REQUEST:
        return getRequest();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case REQUEST:
        return isSetRequest();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof queryMetric_args)
        return this.equals((queryMetric_args)that);
      return false;
    }

    public boolean equals(queryMetric_args that) {
      if (that == null)
        return false;

      boolean this_present_request = true && this.isSetRequest();
      boolean that_present_request = true && that.isSetRequest();
      if (this_present_request || that_present_request) {
        if (!(this_present_request && that_present_request))
          return false;
        if (!this.request.equals(that.request))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_request = true && (isSetRequest());
      list.add(present_request);
      if (present_request)
        list.add(request);

      return list.hashCode();
    }

    @Override
    public int compareTo(queryMetric_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetRequest()).compareTo(other.isSetRequest());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetRequest()) {
        lastComparison = libthrift091.TBaseHelper.compareTo(this.request, other.request);
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
      StringBuilder sb = new StringBuilder("queryMetric_args(");
      boolean first = true;

      sb.append("request:");
      if (this.request == null) {
        sb.append("null");
      } else {
        sb.append(this.request);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws libthrift091.TException {
      // check for required fields
      // check for sub-struct validity
      if (request != null) {
        request.validate();
      }
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

    private static class queryMetric_argsStandardSchemeFactory implements SchemeFactory {
      public queryMetric_argsStandardScheme getScheme() {
        return new queryMetric_argsStandardScheme();
      }
    }

    private static class queryMetric_argsStandardScheme extends StandardScheme<queryMetric_args> {

      public void read(libthrift091.protocol.TProtocol iprot, queryMetric_args struct) throws libthrift091.TException {
        libthrift091.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == libthrift091.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // REQUEST
              if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
                struct.request = new MetricQueryRequest();
                struct.request.read(iprot);
                struct.setRequestIsSet(true);
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

      public void write(libthrift091.protocol.TProtocol oprot, queryMetric_args struct) throws libthrift091.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.request != null) {
          oprot.writeFieldBegin(REQUEST_FIELD_DESC);
          struct.request.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class queryMetric_argsTupleSchemeFactory implements SchemeFactory {
      public queryMetric_argsTupleScheme getScheme() {
        return new queryMetric_argsTupleScheme();
      }
    }

    private static class queryMetric_argsTupleScheme extends TupleScheme<queryMetric_args> {

      @Override
      public void write(libthrift091.protocol.TProtocol prot, queryMetric_args struct) throws libthrift091.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetRequest()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetRequest()) {
          struct.request.write(oprot);
        }
      }

      @Override
      public void read(libthrift091.protocol.TProtocol prot, queryMetric_args struct) throws libthrift091.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.request = new MetricQueryRequest();
          struct.request.read(iprot);
          struct.setRequestIsSet(true);
        }
      }
    }

  }

  public static class queryMetric_result implements libthrift091.TBase<queryMetric_result, queryMetric_result._Fields>, java.io.Serializable, Cloneable, Comparable<queryMetric_result>   {
    private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("queryMetric_result");

    private static final libthrift091.protocol.TField SUCCESS_FIELD_DESC = new libthrift091.protocol.TField("success", libthrift091.protocol.TType.LIST, (short)0);
    private static final libthrift091.protocol.TField SE_FIELD_DESC = new libthrift091.protocol.TField("se", libthrift091.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new queryMetric_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new queryMetric_resultTupleSchemeFactory());
    }

    public List<TimeSeriesData> success; // required
    public com.xiaomi.infra.galaxy.rpc.thrift.ServiceException se; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements libthrift091.TFieldIdEnum {
      SUCCESS((short)0, "success"),
      SE((short)1, "se");

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
          case 0: // SUCCESS
            return SUCCESS;
          case 1: // SE
            return SE;
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
    public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new libthrift091.meta_data.FieldMetaData("success", libthrift091.TFieldRequirementType.DEFAULT, 
          new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
              new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TimeSeriesData.class))));
      tmpMap.put(_Fields.SE, new libthrift091.meta_data.FieldMetaData("se", libthrift091.TFieldRequirementType.DEFAULT, 
          new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRUCT)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(queryMetric_result.class, metaDataMap);
    }

    public queryMetric_result() {
    }

    public queryMetric_result(
      List<TimeSeriesData> success,
      com.xiaomi.infra.galaxy.rpc.thrift.ServiceException se)
    {
      this();
      this.success = success;
      this.se = se;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public queryMetric_result(queryMetric_result other) {
      if (other.isSetSuccess()) {
        List<TimeSeriesData> __this__success = new ArrayList<TimeSeriesData>(other.success.size());
        for (TimeSeriesData other_element : other.success) {
          __this__success.add(new TimeSeriesData(other_element));
        }
        this.success = __this__success;
      }
      if (other.isSetSe()) {
        this.se = new com.xiaomi.infra.galaxy.rpc.thrift.ServiceException(other.se);
      }
    }

    public queryMetric_result deepCopy() {
      return new queryMetric_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
      this.se = null;
    }

    public int getSuccessSize() {
      return (this.success == null) ? 0 : this.success.size();
    }

    public java.util.Iterator<TimeSeriesData> getSuccessIterator() {
      return (this.success == null) ? null : this.success.iterator();
    }

    public void addToSuccess(TimeSeriesData elem) {
      if (this.success == null) {
        this.success = new ArrayList<TimeSeriesData>();
      }
      this.success.add(elem);
    }

    public List<TimeSeriesData> getSuccess() {
      return this.success;
    }

    public queryMetric_result setSuccess(List<TimeSeriesData> success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public com.xiaomi.infra.galaxy.rpc.thrift.ServiceException getSe() {
      return this.se;
    }

    public queryMetric_result setSe(com.xiaomi.infra.galaxy.rpc.thrift.ServiceException se) {
      this.se = se;
      return this;
    }

    public void unsetSe() {
      this.se = null;
    }

    /** Returns true if field se is set (has been assigned a value) and false otherwise */
    public boolean isSetSe() {
      return this.se != null;
    }

    public void setSeIsSet(boolean value) {
      if (!value) {
        this.se = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((List<TimeSeriesData>)value);
        }
        break;

      case SE:
        if (value == null) {
          unsetSe();
        } else {
          setSe((com.xiaomi.infra.galaxy.rpc.thrift.ServiceException)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      case SE:
        return getSe();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      case SE:
        return isSetSe();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof queryMetric_result)
        return this.equals((queryMetric_result)that);
      return false;
    }

    public boolean equals(queryMetric_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      boolean this_present_se = true && this.isSetSe();
      boolean that_present_se = true && that.isSetSe();
      if (this_present_se || that_present_se) {
        if (!(this_present_se && that_present_se))
          return false;
        if (!this.se.equals(that.se))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_success = true && (isSetSuccess());
      list.add(present_success);
      if (present_success)
        list.add(success);

      boolean present_se = true && (isSetSe());
      list.add(present_se);
      if (present_se)
        list.add(se);

      return list.hashCode();
    }

    @Override
    public int compareTo(queryMetric_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = libthrift091.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      lastComparison = Boolean.valueOf(isSetSe()).compareTo(other.isSetSe());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSe()) {
        lastComparison = libthrift091.TBaseHelper.compareTo(this.se, other.se);
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
      StringBuilder sb = new StringBuilder("queryMetric_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      if (!first) sb.append(", ");
      sb.append("se:");
      if (this.se == null) {
        sb.append("null");
      } else {
        sb.append(this.se);
      }
      first = false;
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

    private static class queryMetric_resultStandardSchemeFactory implements SchemeFactory {
      public queryMetric_resultStandardScheme getScheme() {
        return new queryMetric_resultStandardScheme();
      }
    }

    private static class queryMetric_resultStandardScheme extends StandardScheme<queryMetric_result> {

      public void read(libthrift091.protocol.TProtocol iprot, queryMetric_result struct) throws libthrift091.TException {
        libthrift091.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == libthrift091.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == libthrift091.protocol.TType.LIST) {
                {
                  libthrift091.protocol.TList _list10 = iprot.readListBegin();
                  struct.success = new ArrayList<TimeSeriesData>(_list10.size);
                  TimeSeriesData _elem11;
                  for (int _i12 = 0; _i12 < _list10.size; ++_i12)
                  {
                    _elem11 = new TimeSeriesData();
                    _elem11.read(iprot);
                    struct.success.add(_elem11);
                  }
                  iprot.readListEnd();
                }
                struct.setSuccessIsSet(true);
              } else { 
                libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            case 1: // SE
              if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
                struct.se = new com.xiaomi.infra.galaxy.rpc.thrift.ServiceException();
                struct.se.read(iprot);
                struct.setSeIsSet(true);
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

      public void write(libthrift091.protocol.TProtocol oprot, queryMetric_result struct) throws libthrift091.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.success.size()));
            for (TimeSeriesData _iter13 : struct.success)
            {
              _iter13.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
        if (struct.se != null) {
          oprot.writeFieldBegin(SE_FIELD_DESC);
          struct.se.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class queryMetric_resultTupleSchemeFactory implements SchemeFactory {
      public queryMetric_resultTupleScheme getScheme() {
        return new queryMetric_resultTupleScheme();
      }
    }

    private static class queryMetric_resultTupleScheme extends TupleScheme<queryMetric_result> {

      @Override
      public void write(libthrift091.protocol.TProtocol prot, queryMetric_result struct) throws libthrift091.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        if (struct.isSetSe()) {
          optionals.set(1);
        }
        oprot.writeBitSet(optionals, 2);
        if (struct.isSetSuccess()) {
          {
            oprot.writeI32(struct.success.size());
            for (TimeSeriesData _iter14 : struct.success)
            {
              _iter14.write(oprot);
            }
          }
        }
        if (struct.isSetSe()) {
          struct.se.write(oprot);
        }
      }

      @Override
      public void read(libthrift091.protocol.TProtocol prot, queryMetric_result struct) throws libthrift091.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(2);
        if (incoming.get(0)) {
          {
            libthrift091.protocol.TList _list15 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
            struct.success = new ArrayList<TimeSeriesData>(_list15.size);
            TimeSeriesData _elem16;
            for (int _i17 = 0; _i17 < _list15.size; ++_i17)
            {
              _elem16 = new TimeSeriesData();
              _elem16.read(iprot);
              struct.success.add(_elem16);
            }
          }
          struct.setSuccessIsSet(true);
        }
        if (incoming.get(1)) {
          struct.se = new com.xiaomi.infra.galaxy.rpc.thrift.ServiceException();
          struct.se.read(iprot);
          struct.setSeIsSet(true);
        }
      }
    }

  }

}
