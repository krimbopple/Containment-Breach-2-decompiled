Function injureplayer%(arg0#, arg1#, arg2#, arg3#, arg4#)
    If (((CB64D8DZF <> Null) And (CB64D8DZF <> TXXF6F02DB2[GUESSEDupdatedropitem()])) <> 0) Then
        GUESSEDplayinjureplayer(CB64D8DZF, arg0, arg3, arg4)
        Return $00
    EndIf
    XZ0260X8X2\Field11 = ((((XZ0260X8X2\Field11 + arg0) - ((Float (T8660BZ460\Field6 = $01)) * arg3)) - (((Float (T8660BZ460\Field6 = $02)) * arg3) * 1.4)) - ((Float T8660BZ460\Field7) * arg4))
    XZ0260X8X2\Field64 = (XZ0260X8X2\Field64 + ((Float (0.0 = i_1025\Field1[$03])) * arg2))
    i_008\Field0 = (i_008\Field0 + ((Float (T8660BZ460\Field10 = $00)) * arg1))
    Return $00
End Function
