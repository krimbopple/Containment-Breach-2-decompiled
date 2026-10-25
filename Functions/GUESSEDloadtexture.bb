Function GUESSEDloadtexture%(arg0.T24B4ZF6F6, arg1%)
    If (((GUESSEDgetarray_2(arg1) <> "") And (arg0\Field3\Field5 = $00)) <> 0) Then
        If (arg0\Field3\Field40 > $00) Then
            GUESSEDgetbrush(arg0\Field9, loadtexture_strict(GUESSEDgetarray_2(arg1), $01, $01, 1.0), arg0\Field3\Field40, $14000, $FF, $FF, $FF)
        Else
            GUESSEDgetbrush(arg0\Field9, loadtexture_strict(GUESSEDgetarray_2(arg1), $01, $01, 1.0), $01, $14000, $FF, $FF, $FF)
        EndIf
    EndIf
    DZ64X028\Field13 = arg1
    Return $00
End Function
