Function GUESSEDgetmap_3%(arg0$, arg1$)
    Local local0$
    Local local1$
    Local local2.materials
    Local local3.materials
    Local local4$
    If (inisectionexist(arg0, arg1, $01) = $00) Then
        arg1 = lower(arg1)
    EndIf
    If (inisectionexist(arg0, arg1, $01) <> 0) Then
        local1 = lower(arg1)
        local2 = Null
        For local3 = Each materials
            If (local3\Field7 = local1) Then
                local2 = local3
                Exit
            EndIf
        Next
        If (local2 = Null) Then
            local2 = (New materials)
            local2\Field7 = local1
        EndIf
        local4 = inigetstring(arg0, arg1, "animated", "", $01)
        If (local4 <> "") Then
            local2\Field4 = $01
            local2\Field1 = (Int piece(local4, $01, "|"))
            local2\Field2 = (Int piece(local4, $02, "|"))
            local2\Field3 = (Int piece(local4, $03, "|"))
            local2\Field18 = (Int piece(local4, $04, "|"))
        EndIf
        If (opt\Field58 <> 0) Then
            local2\Field15[$01] = inigetstring(arg0, arg1, "normal", "", $01)
        EndIf
        local2\Field15[$03] = inigetstring(arg0, arg1, "emissive", "", $01)
        local2\Field15[$04] = inigetstring(arg0, arg1, "envmap", "", $01)
        local2\Field15[$05] = inigetstring(arg0, arg1, "heightmap", "", $01)
        If (GUESSEDiskey(arg0, arg1, "ormmap", $01) <> 0) Then
            local2\Field15[$02] = inigetstring(arg0, arg1, "ormmap", "", $01)
            local2\Field6 = $01
        Else
            local2\Field15[$02] = inigetstring(arg0, arg1, "roughmetalmap", "", $01)
        EndIf
        local2\Field0 = (GUESSEDiskey(arg0, arg1, "roughness", $01) Lor GUESSEDiskey(arg0, arg1, "metallic", $01))
        local2\Field5 = inigetfloat(arg0, arg1, "roughness", 0.0, $01)
        local2\Field12 = inigetfloat(arg0, arg1, "metallic", 0.0, $01)
        local2\Field16 = (inigetint(arg0, arg1, "reactblackout", $00, $01) <> $00)
        local2\Field8 = inigetint(arg0, arg1, "stepsound", $00, $01)
        local2\Field9 = (inigetint(arg0, arg1, "transparent", $00, $01) <> $00)
        local2\Field11 = (inigetint(arg0, arg1, "masked", $00, $01) <> $00)
        local2\Field14 = inigetint(arg0, arg1, "type", $01, $01)
        local2\Field17 = (inigetint(arg0, arg1, "emissivecolor", $00, $01) <> $00)
    EndIf
    Return $00
End Function
