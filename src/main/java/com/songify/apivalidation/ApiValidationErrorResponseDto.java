package com.songify.apivalidation;

import java.util.List;

public record ApiValidationErrorResponseDto(List<String> error) {
}
