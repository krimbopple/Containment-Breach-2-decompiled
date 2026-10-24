Function initloadingscreens%(arg0$)
    If (loadingscreensdoc <> $00) Then
        Y00DFZDDF6(loadingscreensdoc)
    EndIf
    loadingscreensdoc = X22X8B6X80((lang\Field0 + arg0))
    If (T4FDZFB8X4(loadingscreensdoc) <> 0) Then
        loadingscreens = TD4644B68Z(loadingscreensdoc)
    Else
        Y00DFZDDF6(loadingscreensdoc)
        
        loadingscreensdoc = eax_001A
        loadingscreens = TD4644B68Z(loadingscreensdoc)
    EndIf
    Return $00
End Function
