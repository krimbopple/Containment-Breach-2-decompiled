Function GUESSEDfreeentityresources%(arg0.TX2BF6X0FF4)
    If (arg0 = Null) Then
        Return $00
    EndIf
    GUESSEDclearmap_2(arg0\Field13)
    GUESSEDupdateobjects_20(arg0)
    GUESSEDcallfreeentity_11(arg0)
    GUESSEDfreeentity_6(arg0)
    GUESSEDfreeentity_10(arg0)
    GUESSEDdeleteitemfields(arg0)
    GUESSEDfreeentity_8(arg0)
    GUESSEDdeletestream(arg0)
    GUESSEDdeleteentity_5(arg0)
    GUESSEDdeleteclose(arg0)
    GUESSEDfreedeque_2(arg0)
    If (arg0\Field46 <> Null) Then
        GUESSEDfreedeque(arg0\Field46)
    EndIf
    TXXF6F02DB2[arg0\Field13] = Null
    Delete arg0\Field55
    Delete arg0
    GUESSEDsetglobal_9($FFFFFFFF)
    Return $01
    Return $00
End Function
