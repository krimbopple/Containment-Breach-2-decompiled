Function GUESSEDupdateobjects_35%(arg0.T484FFBZX, arg1.TX2BF6X0FF4)
    Local local0%
    Local local1.items
    If (arg1 = Null) Then
        Return $00
    EndIf
    GUESSEDsetpoke_3(arg0, arg1\Field55\Field21)
    GUESSEDsetpoke_3(arg0, arg1\Field55\Field16)
    GUESSEDsetpoke_4(arg0, 0.0)
    GUESSEDsetpoke_4(arg0, arg1\Field55\Field18)
    If (arg1\Field46\Field13 <> Null) Then
        GUESSEDwriteentityfields(arg0, arg1\Field46\Field13)
    Else
        GUESSEDsetpoke_2(arg0, $00)
    EndIf
    For local0 = $00 To $09 Step $01
        GUESSEDsetpoke(arg0, GUESSEDcheckvalue_6(arg1, local0))
        local1 = GUESSEDgetitems(arg1, local0)
        If (local1 <> Null) Then
            GUESSEDsetpoke(arg0, local1\Field6\Field11)
        Else
            GUESSEDsetpoke(arg0, $00)
        EndIf
    Next
    Return $00
End Function
