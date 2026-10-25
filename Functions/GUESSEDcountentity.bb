Function GUESSEDcountentity%(arg0.doors, arg1%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    If (arg0\Field28 <> 0) Then
        Return $00
    EndIf
    If (arg1 <> $FFFFFFFF) Then
        local0 = arg1
    ElseIf (arg0\Field44 = $09) Then
        local0 = $03
    ElseIf (((0.0 < arg0\Field13) And (180.0 > arg0\Field13)) <> 0) Then
        local0 = $01
    ElseIf ((((arg0\Field21 = $01) Lor arg0\Field12) Lor arg0\Field38) <> 0) Then
        local0 = $02
    Else
        local0 = $00
    EndIf
    For local1 = $00 To $01 Step $01
        If (arg0\Field40[local1] <> $00) Then
            If (countchildren(d_i\Field11[arg0\Field3[local1]]) = $00) Then
                entitytexture(arg0\Field40[local1], d_i\Field1[local0], $00, $00)
                GUESSEDfreeentity_7(arg0\Field40[local1], $FFFFFFFF, $00)
            Else
                local2 = getchild(d_i\Field11[arg0\Field3[local1]], (local0 + $01))
                entityinstance(arg0\Field40[local1], local2)
                For local3 = $00 To $04 Step $01
                    local4 = findchild(arg0\Field40[local1], ("Button" + (Str local3)))
                    If (local4 <> $00) Then
                        entityinstance(local4, findchild(local2, ("Button" + (Str local3))))
                    EndIf
                Next
            EndIf
        EndIf
    Next
    arg0\Field6 = local0
    Return $00
End Function
