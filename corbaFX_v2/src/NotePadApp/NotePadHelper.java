package NotePadApp;


/**
* NotePadApp/NotePadHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from NotePad.idl
* 26 ������ 2019 �. 21:52:39 MSK
*/

abstract public class NotePadHelper
{
  private static String  _id = "IDL:NotePadApp/NotePad:1.0";

  public static void insert (org.omg.CORBA.Any a, NotePadApp.NotePad that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static NotePadApp.NotePad extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (NotePadApp.NotePadHelper.id (), "NotePad");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static NotePadApp.NotePad read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NotePadStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, NotePadApp.NotePad value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static NotePadApp.NotePad narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof NotePadApp.NotePad)
      return (NotePadApp.NotePad)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      NotePadApp._NotePadStub stub = new NotePadApp._NotePadStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static NotePadApp.NotePad unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof NotePadApp.NotePad)
      return (NotePadApp.NotePad)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      NotePadApp._NotePadStub stub = new NotePadApp._NotePadStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
