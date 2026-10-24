Function TXB46FFF4F2%(arg0$)
    Local local0.XF6B6D00Z
    arg0 = lower(arg0)
    If (((ZF202BX28(arg0) = $00) Lor (filetype(arg0) <> $01)) <> 0) Then
        Return $00
    EndIf
    For local0 = Each XF6B6D00Z
        If (local0\Field1 = arg0) Then
            Return local0\Field0
        EndIf
    Next
    local0 = (New XF6B6D00Z)
    local0\Field1 = arg0
    local0\Field0 = loadimage(local0\Field1, $00)
    Return local0\Field0
    Return $00
End Function
