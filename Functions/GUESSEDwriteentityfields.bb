Function GUESSEDwriteentityfields%(arg0.T484FFBZX, arg1.T20BFZFZ62X)
    Local local0%
    GUESSEDsetpoke_2(arg0, arg1\Field2)
    GUESSEDsetpoke_3(arg0, ((arg1\Field18 > $00) + (arg1\Field7 Shl $01)))
    GUESSEDsetpoke_3(arg0, arg1\Field13)
    GUESSEDsetpoke_3(arg0, arg1\Field15)
    GUESSEDsetpoke_3(arg0, arg1\Field16)
    GUESSEDsetpoke_4(arg0, entityx(arg1\Field19, $00, 1.0))
    GUESSEDsetpoke_4(arg0, entityy(arg1\Field19, $00, 1.0))
    GUESSEDsetpoke_4(arg0, entityz(arg1\Field19, $00, 1.0))
    GUESSEDsetpoke(arg0, GUESSEDcallclamp_4(entityyaw(arg1\Field19, $00, 1.0), 10.0))
    GUESSEDsetpoke_2(arg0, arg1\Field0)
    GUESSEDsetpoke(arg0, arg1\Field5)
    If (arg1\Field18 > $00) Then
        For local0 = $00 To $09 Step $01
            If (arg1\Field10[local0] <> Null) Then
                GUESSEDsetpoke_3(arg0, arg1\Field10[local0]\Field5)
            Else
                GUESSEDsetpoke_3(arg0, $00)
            EndIf
        Next
    EndIf
    Return $00
End Function
