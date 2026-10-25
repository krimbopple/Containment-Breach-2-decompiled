Function initloadingscreens%(arg0$)
    If (loadingscreensdoc <> $00) Then
        _JsonFreeDocument(loadingscreensdoc)
    EndIf
    loadingscreensdoc = _JsonParseFromFile((lang\Field0 + arg0))
    If (_JsonIsArray(loadingscreensdoc) <> 0) Then
        loadingscreens = _JsonGetArray(loadingscreensdoc)
    Else
        _JsonFreeDocument(loadingscreensdoc)
        
        loadingscreensdoc = eax_001A
        loadingscreens = _JsonGetArray(loadingscreensdoc)
    EndIf
    Return $00
End Function
