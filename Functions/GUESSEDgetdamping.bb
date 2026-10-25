Function GUESSEDgetdamping%(arg0$, arg1$)
    Local local0$
    Local local1.T82BBBXXXD
    If (inisectionexist(arg0, arg1, $01) = $00) Then
        arg1 = lower(arg1)
    EndIf
    If (inisectionexist(arg0, arg1, $01) <> 0) Then
        local1 = (New T82BBBXXXD)
        local1\Field7 = lower(arg1)
        local1\Field0 = inigetfloat(arg0, arg1, "mass", 1.0, $01)
        local1\Field5 = inigetfloat(arg0, arg1, "lineardamping", 0.1, $01)
        local1\Field6 = inigetfloat(arg0, arg1, "angulardamping", 0.1, $01)
        local1\Field4 = inigetfloat(arg0, arg1, "friction", 0.5, $01)
        local1\Field1 = inigetfloat(arg0, arg1, "restitution", 0.0, $01)
        local1\Field2 = inigetfloat(arg0, arg1, "heightmultiplier", 1.0, $01)
        local1\Field3 = inigetstring(arg0, arg1, "shape", "box", $01)
    EndIf
    Return $00
End Function
