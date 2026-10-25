Function GUESSEDgetnextentity.TX2BF6X0FF4(arg0.TX2BF6X0FF4, arg1%)
    Local local0%
    Local local1%
    If (((arg0 = Null) Lor (arg1 = $00)) <> 0) Then
        arg0 = (First TX2BF6X0FF4)
    Else
        local0 = arg0\Field13
        While (local1 < $100)
            local0 = (local0 + arg1)
            If (local0 > $100) Then
                local0 = $00
            ElseIf (local0 < $01) Then
                local0 = $100
            EndIf
            If (((TXXF6F02DB2[local0] <> Null) And (entityhidden(TXXF6F02DB2[local0]\Field52) = $00)) <> 0) Then
                arg0 = TXXF6F02DB2[local0]
                Exit
            EndIf
            local1 = (local1 + $01)
        Wend
    EndIf
    Return arg0
    Return Null
End Function
