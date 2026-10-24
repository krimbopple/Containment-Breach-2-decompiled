Function T2XZ8BB44DZ%(arg0.npcs)
    If (((arg0\Field50 = $00) And (TXB2BFFFFFX() = $00)) <> 0) Then
        arg0\Field21 = curveangle(arg0\Field19, arg0\Field21, 4.0)
        arg0\Field18 = curveangle(arg0\Field102, arg0\Field18, 4.0)
        rotateentity(arg0\Field82, entitypitch(arg0\Field82, $01, 1.0), arg0\Field18, entityroll(arg0\Field82, $01, 1.0), $01)
        rotateentity(arg0\Field98, entitypitch(arg0\Field98, $01, 1.0), arg0\Field21, entityroll(arg0\Field98, $01, 1.0), $01)
        If (0.0 < arg0\Field51) Then
            arg0\Field0 = T40BXDD4B2(arg0\Field98, arg0\Field0, (Int arg0\Field54), (Int arg0\Field16), arg0\Field52, arg0\Field78)
            F48XZXBBF(arg0, arg0\Field0)
            If (((0.0 >= arg0\Field68) And (isequal(arg0\Field0, arg0\Field103, 3.0) = $00)) <> 0) Then
                arg0\Field103 = arg0\Field0
                arg0\Field68 = 70.0
            EndIf
            arg0\Field68 = (arg0\Field68 - fps\Field3[$00])
            If (isequal(arg0\Field51, arg0\Field44, 0.1) <> 0) Then
                arg0\Field12 = (arg0\Field12 + fps\Field3[$00])
                If (70.0 <= arg0\Field12) Then
                    setanimtime(arg0\Field98, arg0\Field51, $00)
                    arg0\Field0 = arg0\Field51
                    arg0\Field103 = arg0\Field51
                EndIf
            Else
                arg0\Field12 = 0.0
            EndIf
            arg0\Field44 = arg0\Field51
        EndIf
    EndIf
    Return $00
End Function
