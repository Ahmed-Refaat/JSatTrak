// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ClockStoppedException.java

package javax.media;


// Referenced classes of package javax.media:
//            MediaException

public class ClockStoppedException extends MediaException
{

    public ClockStoppedException()
    {
    }

    public ClockStoppedException(String reason)
    {
        super(reason);
    }
}