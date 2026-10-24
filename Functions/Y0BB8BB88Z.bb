Function Y0BB8BB88Z#(arg0.TX2BF6X0FF4, arg1#, arg2#, arg3#)
    Local local0%
    Local local1%
    local0 = E0B68ZZ2(arg0, $01)
    local1 = E0B68ZZ2(arg0, $02)
    Select local0
        Case $05
            arg1 = (arg1 - arg2)
        Case $06
            arg1 = (arg1 - (arg2 * 1.4))
    End Select
    Select local1
        Case $07
            arg1 = (arg1 - arg3)
        Case $1D
            arg1 = (arg1 - (arg3 * 2.0))
    End Select
    If (0.0 > arg1) Then
        arg1 = 0.0
    EndIf
    Return arg1
    Return 0.0
End Function
