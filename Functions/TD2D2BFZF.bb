Function TD2D2BFZF#(arg0%)
    Local local0#
    local0 = (DZ64X028\Field70 * (Float arg0))
    If (((DZ64X028\Field18 <> Null) And (DZ64X028\Field18\Field2 <> $00)) <> 0) Then
        local0 = (entityyaw(DZ64X028\Field18\Field2, $00, 1.0) + local0)
    EndIf
    Return local0
    Return 0.0
End Function
