Function GUESSEDsetentity%(arg0.TX2BF6X0FF4)
    Local local0%
    Local local1%
    Local local2.T24B4ZF6F6
    Local local3%
    If (entityinview(arg0\Field55\Field7, camera) = $00) Then
        arg0\Field55\Field23 = $00
        GUESSEDcallanimate(arg0, $0E, $01)
    Else
        arg0\Field55\Field23 = $01
        arg0\Field55\Field2 = arg0\Field20
        local0 = $00
        local1 = GUESSEDcheckvalue_6(arg0, $05)
        If (local1 <> $00) Then
            local2 = GUESSEDrenderrendergui_4(GUESSEDcheckvalue_8(local1))
            If ((((local2 <> Null) And (local2\Field3\Field26 = $00)) And (local2\Field3\Field42 = $00)) <> 0) Then
                local3 = (T6DX2BF8DB[(((local2\Field6 Shl $02) + $00) Shr $02)] + $01)
                If (((arg0\Field55\Field5\Field6[local3] <> "") And (arg0\Field20 <= $07)) <> 0) Then
                    GUESSEDanimateanimating(arg0, local3, $01, $04)
                    local0 = $01
                ElseIf (arg0\Field20 <= $05) Then
                    arg0\Field55\Field2 = (T6DX2BF8DB[(((local2\Field6 Shl $02) + $00) Shr $02)] + arg0\Field20)
                EndIf
            EndIf
        EndIf
        GUESSEDanimateanimating(arg0, arg0\Field55\Field2, $01, $02)
        If (local0 = $00) Then
            GUESSEDcallanimate(arg0, $04, $01)
        EndIf
    EndIf
    Return $00
End Function
