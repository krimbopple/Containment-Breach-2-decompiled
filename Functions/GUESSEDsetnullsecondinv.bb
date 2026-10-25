Function GUESSEDsetnullsecondinv%(arg0.items, arg1.items)
    Local local0%
    Local local1%
    Local local2.items
    If (((GUESSEDupdatexdb() = $00) Lor (arg0 = Null)) <> 0) Then
        Return $00
    EndIf
    If (arg1 = Null) Then
        local1 = $00
        GUESSEDgetmap($00, arg0\Field18)
        local2 = eax_0012
        If (local2 <> Null) Then
            GUESSEDupdateobjects_25(arg0, local2)
            GUESSEDsetanim_2(local2, (GUESSEDupdateobjects_34(local2) = $00))
        EndIf
        arg0\Field18 = $00
    Else
        arg0\Field18 = arg1\Field27
        arg0\Field26 = 70.0
        arg0\Field17 = $01
        GUESSEDsetanim_2(arg1, $01)
    EndIf
    If (((GUESSEDupdateanimatenpc() = $00) And (arg0\Field29 = GUESSEDupdatedropitem())) <> 0) Then
        GUESSEDsenditemaction(arg0, arg1)
    EndIf
    Return $00
End Function
