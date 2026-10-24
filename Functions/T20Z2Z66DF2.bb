Function T20Z2Z66DF2%(arg0%)
    Local local0%
    Local local1%
    Local local2%
    If (TXDF22DBZ62 = $00) Then
        Return $00
    EndIf
    local0 = X4XDZ864X8()
    local1 = createbank(local0)
    local2 = X68F4FDXFF(TXDF22DBZ62, arg0, local0, local1, banksize(local1))
    If (local2 <> $FFFFFFFF) Then
        resizebank(local1, local2)
    Else
        freebank(local1)
        local1 = $00
        Return $00
    EndIf
    Return local1
    Return $00
End Function
