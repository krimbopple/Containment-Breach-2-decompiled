Function GUESSEDcallanimate%(arg0.TX2BF6X0FF4, arg1%, arg2%)
    Local local0%
    Local local1%
    local0 = eax_0007
    local1 = (local0 - $01)
    While (local1 >= $00)
        
        If ((eax_001B And arg1) <> 0) Then
            If (arg0\Field55\Field7 <> $00) Then
                
                animate(arg0\Field55\Field7, $00, 0.0, eax_0036, (Float ($07 * arg2)))
            EndIf
            Delete ((local1 Shl $02) + arg0\Field55\Field25)
        EndIf
        local1 = (local1 + $FFFFFFFF)
    Wend
    Return $00
End Function
