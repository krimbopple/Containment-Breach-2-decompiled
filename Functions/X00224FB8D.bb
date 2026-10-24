Function X00224FB8D%(arg0.T484FFBZX, arg1%)
    Local local0%
    Local local1%
    If ((arg0\Field2 + arg1) > banksize(arg0\Field3)) Then
        local0 = (arg0\Field2 + arg1)
        local1 = banksize(arg0\Field3)
        If ((Float local0) < ((Float local1) * 1.5)) Then
            local0 = (Int ((Float local1) * 1.5))
        EndIf
        resizebank(arg0\Field3, local0)
    EndIf
    Return $00
End Function
