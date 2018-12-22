FROM golang:alpine as builder
LABEL MAINTAINER ${name} <${email}>

ENV PATH /go/bin:/usr/local/go/bin:\$PATH
ENV GOPATH /go

RUN	apk add --no-cache \
	bash \
	ca-certificates

COPY . /go/src/github.com/${nickname}/${projectname}

RUN set -x \
	&& apk add --no-cache --virtual .build-deps \
		git \
		gcc \
		libc-dev \
		libgcc \
		make \
	&& cd /go/src/github.com/${nickname}/${projectname} \
	&& make static \
	&& mv ${projectname} /usr/bin/${projectname} \
	&& apk del .build-deps \
	&& rm -rf /go \
	&& echo "Build complete."

FROM alpine:latest

COPY --from=builder /usr/bin/${projectname} /usr/bin/${projectname}
COPY --from=builder /etc/ssl/certs/ /etc/ssl/certs

ENTRYPOINT [ "${projectname}" ]
CMD [ "--help" ]
