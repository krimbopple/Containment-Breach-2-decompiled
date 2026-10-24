Function istexalpha%(arg0%, arg1$)
    Local local0.materials
    Local local1$
    Local local2%
    Local local3%
    If (arg1 = "") Then
        local1 = strippath(texturename(arg0))
    Else
        local1 = arg1
    EndIf
    For local0 = Each materials
        If (local0\Field7 = local1) Then
            local2 = local0\Field9
            local3 = local0\Field11
            Exit
        EndIf
    Next
    Return ((((local2 <> $00) Shl $01) + $01) + ((local3 <> $00) Shl $02))
    Return $00
End Function
